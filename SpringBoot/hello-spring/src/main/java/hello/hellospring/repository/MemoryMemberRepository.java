package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{
    // option + Enter 누르면 implement 할 수 있음.

    //Member를 저장할 공간
    private static Map<Long, Member> store = new HashMap<>();

    private static long sequence = 0L; // key 값을 0,1,2...로 생성해주는 역할

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
        // store.get(id)의 결과가 없어서 null이 반환되더라도 Optioanl.ofNullable을 사용하면 감쌀 수 있다.
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
        // findAny()는 하나라도 찾으면 반환해버린다.
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}
