package cap.dao;

import cap.model.Admin;

import java.util.List;

public interface AdminDAO {
    Admin login(Admin admin);

    List<Admin> list();

    Admin findById(Integer id);

    Integer update(Admin admin);

    Integer delete(Integer id);

    List<Admin> findByPage(int pageNo, int pageSize);

    Integer getTotalCount();

    Integer insert(Admin admin);
}
