package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
        // Test는 작성한 코드 순서대로 동작하는게 아니라 한 번에 동작할 때 아무처리를 안해주면 꼬이게 된다.
        // 따라서 각의 Test가 끝날 때마다 store를 비워준다. Test는 순서에 관계없이 작동하도록 만들어야 한다.
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        //Optional에서 값을 꺼 낼 때는 get()을 사용한다.get()은 Optional에서 한 번 까서 나오게 한다.
        assertThat(member).isEqualTo(result);
        // new로 만든 member와 DB에서 꺼낸 Member가 완전히 똑같은지 확인
        // Assertions.assertEquals(member, result); 로도 확인 가능
        // 요즘에는 assertThat많이 쓴다. Assertions.assertThat(member).isEqualTo(result); Assertions import static해서 생략함.
        // member와 result의 순서가 헷갈리지 않는 장점
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        //shift + f6 누르면 member1 -> member2로 rename할 수 있게 자동으로 뜬다.
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);


    }

}
