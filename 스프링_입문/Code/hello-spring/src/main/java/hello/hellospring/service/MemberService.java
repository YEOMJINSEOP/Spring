package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class MemberService {
// class에 커서 올리고 command + shift + t 누르면 test 만들 수 있는 단축키.
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository){

        this.memberRepository = memberRepository;
    }
    // interface를 new로 생성할 수는 없으므로 구현 인스턴스로 생성한다.

    /**
     * 회원 가입
     */
    public Long join(Member member){

        validateDuplicateMember(member); // 중복회원 검즘
        memberRepository.save(member);
        return member.getId();
    }

    //같은 이름이 있는 중복 회원 x

//        Optional<Member> result = memberRepository.findByName(member.getName()); // 맨 끝에서 command + option + v 누르면 반환 타입, 이름 자동으로 설정해줌.
//        result.ifPresent(m -> {
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//            // result가 null이라고 하더라도, Optional로 한 번 감싸서 나오기 때문에
//            // 따로 null 처리를 하지 않고, ifPresent를 사용할 수 있다.
//        });
//        Optional이 나와 있는걸 권장하지 않으므로 다음과 같이 표현할 수 있다.
//        결국 memberReposiroty.findByName(member.getName())은 Optional<Member>이기 떄문에

    // 또한, 메소드로 extract해주는 것이 좋은데,
    // control + T 누르면 refactoring 관련 동작 검색할 수 있다.
    // extract method 검색하면 command + option + m 이 단축키임을 알 수 있다.

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                        .ifPresent(m -> {
                            throw new IllegalStateException("이미 존재하는 회원입니다.");
                        });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
