package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
// 해당 클래스를 스캔 대상으로 한다.
public class MemberDao {
	private static long nextId = 0;

	private Map<String, Member> map = new HashMap<>();

	public Member selectByEmail(String email) {
		return map.get(email);
	}

	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}

	public void update(Member member) {
		map.put(member.getEmail(), member);
	}

	// 생성자에 전달할 의존 객체가 두개 이상
	public Collection<Member> selectAll() {
		return map.values();
	}
}
