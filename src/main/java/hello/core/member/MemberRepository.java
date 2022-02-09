package hello.core.member;

public interface MemberRepository {

    void save(Member member);     // 회원 저장소. 회원 정보를 저장한다.

    Member findById(Long memberId);     // memberId 를 인자로 받아와 member 객체를 반환한다.
}
