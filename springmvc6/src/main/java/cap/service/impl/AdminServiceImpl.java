package cap.service.impl;

import cap.dao.AdminDAO;
import cap.model.Admin;
import cap.service.AdminService;
import cap.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDAO adminDAO;
    @Override
    public Admin login(Admin admin) {

        return adminDAO.login(admin);
    }
    @Override
    public Admin findById(Integer id) {
        return adminDAO.findById(id);
    }

    @Override
    public PageBean findByPage(int pageNo, int pageSize) {
        PageBean pageBean = new PageBean();
        pageBean.setList(adminDAO.findByPage(pageNo, pageSize));
        pageBean.setPageNo(pageNo);
        pageBean.setPageSize(pageSize);
        pageBean.setTotalRecords(adminDAO.getTotalCount());
        return pageBean;
    }

    @Override
    public Integer delete(Integer id) {
        return adminDAO.delete(id);
    }

    @Override
    public Integer update(Admin admin) {
        return adminDAO.update(admin);
    }

    @Override
    public Integer insert(Admin admin) {
        return adminDAO.insert(admin);
    }
}
