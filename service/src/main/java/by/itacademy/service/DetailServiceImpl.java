package by.itacademy.service;

import by.itacademy.dao.DetailDao;
import by.itacademy.dao.common.BaseDao;
import by.itacademy.entity.productEntity.Detail;
import by.itacademy.service.common.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class DetailServiceImpl extends BaseServiceImpl<Detail> implements DetailService {

    @Autowired
    private DetailDao detailDao;

    @Override
    public Detail getByName(String name) {
        return detailDao.getByName(name);
    }

    @Override
    protected BaseDao<Detail> getDao() {
        return detailDao;
    }
}
