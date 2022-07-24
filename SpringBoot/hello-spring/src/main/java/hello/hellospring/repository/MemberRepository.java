package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    // Optional은 null이 들어 왔을 때 null로 반환하는 대신에 optional로 감싸서 반환
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
