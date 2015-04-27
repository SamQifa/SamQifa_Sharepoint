package mountain.service;

import static org.junit.Assert.*;

import java.util.List;

import mountain.model.Team;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TeamServiceImplTest {
	
	@Autowired
	private TeamServiceImpl teamService;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddTeam() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateTeam() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTeam() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteTeam() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTeams() {
		List<Team> teams = teamService.getTeams();
		for (Team team : teams) {
			System.out.println("Team - " + team.toString());
		}
		Assert.assertNull(teams);
	}

}
