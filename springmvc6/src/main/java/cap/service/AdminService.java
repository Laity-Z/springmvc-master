package cap.service;

import cap.model.Admin;
import cap.util.PageBean;

public interface AdminService {
    Admin login(Admin admin);

    PageBean findByPage(int pageNo, int pageSize);

    Integer delete(Integer id);

    Integer update(Admin admin);

    Integer insert(Admin admin);

    Admin findById(Integer id);
}
