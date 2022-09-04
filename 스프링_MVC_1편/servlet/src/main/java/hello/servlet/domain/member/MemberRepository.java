package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;
    // static으로 되어있기 때문에, new로 아무리 많이 MemberRepository를 불러도 딱 하나만 생성된다.

    private static final MemberRepository instance = new MemberRepository();

    // 무조건 getInstance로만 조회할 수 있다.
    public static MemberRepository getInstance(){
        return instance;
    }

    // 싱글톤으로 생성할 때는 private으로 생성자를 막아줘야 한다.
    private MemberRepository(){

    }

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id){
        return store.get(id);
    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}
