package dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import aplication.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class GenericDAO<Entity> {
	private Class<Entity> classe;

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this.classe = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

 	public Entity save(Entity entity) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			return entity;
		} catch (RuntimeException ex) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw ex;
		} finally {
			session.close();
		}
	}

	public List<Entity> index() {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria query = session.createCriteria(classe);
			List<Entity> resultado = query.list();
			return resultado;
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			session.close();
		}
	}

	public Entity delete(Entity entity) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(entity);
			transaction.commit();
			return entity;
		} catch (RuntimeException ex) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw ex;
		} finally {
			session.close();
		}
	}

	public Entity update(Entity entity) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
			return entity;
		} catch (RuntimeException ex) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw ex;
		} finally {
			session.close();
		}
	}

	public Entity searchById(Integer code) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria query = session.createCriteria(classe);
			query.add(Restrictions.idEq(code));
			Entity result = (Entity) query.uniqueResult();
			return result;
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			session.close();
		}
	}
}
