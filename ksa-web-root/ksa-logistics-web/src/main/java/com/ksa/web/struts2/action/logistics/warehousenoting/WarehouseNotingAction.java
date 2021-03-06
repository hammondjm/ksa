package com.ksa.web.struts2.action.logistics.warehousenoting;

import com.ksa.context.ServiceContextUtils;
import com.ksa.dao.logistics.WarehouseNotingDao;
import com.ksa.model.logistics.WarehouseNoting;
import com.ksa.web.struts2.action.logistics.LogisticsModelAction;

public class WarehouseNotingAction extends LogisticsModelAction<WarehouseNoting> {

    private static final long serialVersionUID = -7637184215777453881L;

    @Override
    public WarehouseNoting getModel() {
        if( model == null ) {
            model = new WarehouseNoting();   
        }
        return model;
    }

    @Override
    protected WarehouseNotingDao getDao() {
        return ServiceContextUtils.getService( WarehouseNotingDao.class );
    }
}
