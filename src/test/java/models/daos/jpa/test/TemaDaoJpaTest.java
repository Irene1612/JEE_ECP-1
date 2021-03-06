package models.daos.jpa.test;

import static org.junit.Assert.*;
import models.daos.TemaDao;
import models.daos.jpa.DaoJpaFactory;
import models.entities.Tema;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemaDaoJpaTest {

	private TemaDao dao = DaoJpaFactory.getFactory().getTemaDao();

	private Tema t1;

	@BeforeClass
	public static void init() {
		DaoJpaFactory.setFactory(new DaoJpaFactory());
		DaoJpaFactory.prepareFactoryWithDropAndCreateTables();
	}

	@Before
	public void init1() {
		t1 = new Tema("�Te ha gustado?", "Juegos");
		dao.create(t1);

	}

	@Test
	public void testRead() {
		assertTrue(t1.equals(dao.read(t1.getId())));
	}

	@Test
	public void testUpdate() {
		t1.setNombre("Premios");
		dao.update(t1);
		assertTrue(t1.equals(dao.read(t1.getId())));
	}

	@Test
	public void testDeleteByID() {
		// assertNull
		Tema t4 = new Tema("¿Te han gustado?", "Puzzles");
		dao.create(t4);
		dao.deleteByID(t4.getId());
		assertNull(dao.read(t4.getId()));
	}

	@Test
	public void testFindAll() {
		// size
		assertEquals(1, dao.findAll().size());
	}

}
