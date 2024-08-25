package com.nature.demo.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.nature.demo.utils.db.BaseReferInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BaseReferInfo".
*/
public class BaseReferInfoDao extends AbstractDao<BaseReferInfo, Long> {

    public static final String TABLENAME = "BaseReferInfo";

    /**
     * Properties of entity BaseReferInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property MeaInstrumentID = new Property(1, String.class, "meaInstrumentID", false, "MeaInstrumentID");
        public final static Property MeaHandBookID = new Property(2, String.class, "meaHandBookID", false, "MeaHandBookID");
        public final static Property UserDepartment = new Property(3, String.class, "userDepartment", false, "UserDepartment");
        public final static Property MaterialRef = new Property(4, Double.class, "materialRef", false, "MaterialRef");
        public final static Property LenCD = new Property(5, Double.class, "lenCD", false, "LenCD");
        public final static Property LenAE = new Property(6, Double.class, "lenAE", false, "LenAE");
        public final static Property LenBF = new Property(7, Double.class, "lenBF", false, "LenBF");
        public final static Property LenH = new Property(8, Double.class, "lenH", false, "LenH");
        public final static Property WheelDiameter = new Property(9, Double.class, "wheelDiameter", false, "WheelDiameter");
        public final static Property LenAC = new Property(10, Double.class, "lenAC", false, "LenAC");
        public final static Property LenBD = new Property(11, Double.class, "lenBD", false, "LenBD");
        public final static Property LenAB = new Property(12, Double.class, "lenAB", false, "LenAB");
        public final static Property LenEO = new Property(13, Double.class, "lenEO", false, "LenEO");
        public final static Property LenFO = new Property(14, Double.class, "lenFO", false, "LenFO");
        public final static Property DistSensorAT = new Property(15, Double.class, "distSensorAT", false, "DistSensorAT");
        public final static Property DistSensorBT = new Property(16, Double.class, "distSensorBT", false, "DistSensorBT");
        public final static Property DistSensorCT = new Property(17, Double.class, "distSensorCT", false, "DistSensorCT");
        public final static Property DistSensorDT = new Property(18, Double.class, "distSensorDT", false, "DistSensorDT");
        public final static Property LeftDistSensorKL = new Property(19, Double.class, "leftDistSensorKL", false, "LeftDistSensorKL");
        public final static Property RightDistSensorKR = new Property(20, Double.class, "rightDistSensorKR", false, "RightDistSensorKR");
        public final static Property AngleSensorXT = new Property(21, Double.class, "angleSensorXT", false, "AngleSensorXT");
        public final static Property AngleSensorYT = new Property(22, Double.class, "angleSensorYT", false, "AngleSensorYT");
        public final static Property AngleSensorKX = new Property(23, Double.class, "angleSensorKX", false, "AngleSensorKX");
        public final static Property AngleSensorKY = new Property(24, Double.class, "angleSensorKY", false, "AngleSensorKY");
        public final static Property Temperature = new Property(25, Double.class, "temperature", false, "Temperature");
        public final static Property WheelResolution = new Property(26, Integer.class, "wheelResolution", false, "WheelResolution");
    }


    public BaseReferInfoDao(DaoConfig config) {
        super(config);
    }
    
    public BaseReferInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BaseReferInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String meaInstrumentID = entity.getMeaInstrumentID();
        if (meaInstrumentID != null) {
            stmt.bindString(2, meaInstrumentID);
        }
 
        String meaHandBookID = entity.getMeaHandBookID();
        if (meaHandBookID != null) {
            stmt.bindString(3, meaHandBookID);
        }
 
        String userDepartment = entity.getUserDepartment();
        if (userDepartment != null) {
            stmt.bindString(4, userDepartment);
        }
 
        Double materialRef = entity.getMaterialRef();
        if (materialRef != null) {
            stmt.bindDouble(5, materialRef);
        }
 
        Double lenCD = entity.getLenCD();
        if (lenCD != null) {
            stmt.bindDouble(6, lenCD);
        }
 
        Double lenAE = entity.getLenAE();
        if (lenAE != null) {
            stmt.bindDouble(7, lenAE);
        }
 
        Double lenBF = entity.getLenBF();
        if (lenBF != null) {
            stmt.bindDouble(8, lenBF);
        }
 
        Double lenH = entity.getLenH();
        if (lenH != null) {
            stmt.bindDouble(9, lenH);
        }
 
        Double wheelDiameter = entity.getWheelDiameter();
        if (wheelDiameter != null) {
            stmt.bindDouble(10, wheelDiameter);
        }
 
        Double lenAC = entity.getLenAC();
        if (lenAC != null) {
            stmt.bindDouble(11, lenAC);
        }
 
        Double lenBD = entity.getLenBD();
        if (lenBD != null) {
            stmt.bindDouble(12, lenBD);
        }
 
        Double lenAB = entity.getLenAB();
        if (lenAB != null) {
            stmt.bindDouble(13, lenAB);
        }
 
        Double lenEO = entity.getLenEO();
        if (lenEO != null) {
            stmt.bindDouble(14, lenEO);
        }
 
        Double lenFO = entity.getLenFO();
        if (lenFO != null) {
            stmt.bindDouble(15, lenFO);
        }
 
        Double distSensorAT = entity.getDistSensorAT();
        if (distSensorAT != null) {
            stmt.bindDouble(16, distSensorAT);
        }
 
        Double distSensorBT = entity.getDistSensorBT();
        if (distSensorBT != null) {
            stmt.bindDouble(17, distSensorBT);
        }
 
        Double distSensorCT = entity.getDistSensorCT();
        if (distSensorCT != null) {
            stmt.bindDouble(18, distSensorCT);
        }
 
        Double distSensorDT = entity.getDistSensorDT();
        if (distSensorDT != null) {
            stmt.bindDouble(19, distSensorDT);
        }
 
        Double leftDistSensorKL = entity.getLeftDistSensorKL();
        if (leftDistSensorKL != null) {
            stmt.bindDouble(20, leftDistSensorKL);
        }
 
        Double rightDistSensorKR = entity.getRightDistSensorKR();
        if (rightDistSensorKR != null) {
            stmt.bindDouble(21, rightDistSensorKR);
        }
 
        Double angleSensorXT = entity.getAngleSensorXT();
        if (angleSensorXT != null) {
            stmt.bindDouble(22, angleSensorXT);
        }
 
        Double angleSensorYT = entity.getAngleSensorYT();
        if (angleSensorYT != null) {
            stmt.bindDouble(23, angleSensorYT);
        }
 
        Double angleSensorKX = entity.getAngleSensorKX();
        if (angleSensorKX != null) {
            stmt.bindDouble(24, angleSensorKX);
        }
 
        Double angleSensorKY = entity.getAngleSensorKY();
        if (angleSensorKY != null) {
            stmt.bindDouble(25, angleSensorKY);
        }
 
        Double temperature = entity.getTemperature();
        if (temperature != null) {
            stmt.bindDouble(26, temperature);
        }
 
        Integer wheelResolution = entity.getWheelResolution();
        if (wheelResolution != null) {
            stmt.bindLong(27, wheelResolution);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BaseReferInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String meaInstrumentID = entity.getMeaInstrumentID();
        if (meaInstrumentID != null) {
            stmt.bindString(2, meaInstrumentID);
        }
 
        String meaHandBookID = entity.getMeaHandBookID();
        if (meaHandBookID != null) {
            stmt.bindString(3, meaHandBookID);
        }
 
        String userDepartment = entity.getUserDepartment();
        if (userDepartment != null) {
            stmt.bindString(4, userDepartment);
        }
 
        Double materialRef = entity.getMaterialRef();
        if (materialRef != null) {
            stmt.bindDouble(5, materialRef);
        }
 
        Double lenCD = entity.getLenCD();
        if (lenCD != null) {
            stmt.bindDouble(6, lenCD);
        }
 
        Double lenAE = entity.getLenAE();
        if (lenAE != null) {
            stmt.bindDouble(7, lenAE);
        }
 
        Double lenBF = entity.getLenBF();
        if (lenBF != null) {
            stmt.bindDouble(8, lenBF);
        }
 
        Double lenH = entity.getLenH();
        if (lenH != null) {
            stmt.bindDouble(9, lenH);
        }
 
        Double wheelDiameter = entity.getWheelDiameter();
        if (wheelDiameter != null) {
            stmt.bindDouble(10, wheelDiameter);
        }
 
        Double lenAC = entity.getLenAC();
        if (lenAC != null) {
            stmt.bindDouble(11, lenAC);
        }
 
        Double lenBD = entity.getLenBD();
        if (lenBD != null) {
            stmt.bindDouble(12, lenBD);
        }
 
        Double lenAB = entity.getLenAB();
        if (lenAB != null) {
            stmt.bindDouble(13, lenAB);
        }
 
        Double lenEO = entity.getLenEO();
        if (lenEO != null) {
            stmt.bindDouble(14, lenEO);
        }
 
        Double lenFO = entity.getLenFO();
        if (lenFO != null) {
            stmt.bindDouble(15, lenFO);
        }
 
        Double distSensorAT = entity.getDistSensorAT();
        if (distSensorAT != null) {
            stmt.bindDouble(16, distSensorAT);
        }
 
        Double distSensorBT = entity.getDistSensorBT();
        if (distSensorBT != null) {
            stmt.bindDouble(17, distSensorBT);
        }
 
        Double distSensorCT = entity.getDistSensorCT();
        if (distSensorCT != null) {
            stmt.bindDouble(18, distSensorCT);
        }
 
        Double distSensorDT = entity.getDistSensorDT();
        if (distSensorDT != null) {
            stmt.bindDouble(19, distSensorDT);
        }
 
        Double leftDistSensorKL = entity.getLeftDistSensorKL();
        if (leftDistSensorKL != null) {
            stmt.bindDouble(20, leftDistSensorKL);
        }
 
        Double rightDistSensorKR = entity.getRightDistSensorKR();
        if (rightDistSensorKR != null) {
            stmt.bindDouble(21, rightDistSensorKR);
        }
 
        Double angleSensorXT = entity.getAngleSensorXT();
        if (angleSensorXT != null) {
            stmt.bindDouble(22, angleSensorXT);
        }
 
        Double angleSensorYT = entity.getAngleSensorYT();
        if (angleSensorYT != null) {
            stmt.bindDouble(23, angleSensorYT);
        }
 
        Double angleSensorKX = entity.getAngleSensorKX();
        if (angleSensorKX != null) {
            stmt.bindDouble(24, angleSensorKX);
        }
 
        Double angleSensorKY = entity.getAngleSensorKY();
        if (angleSensorKY != null) {
            stmt.bindDouble(25, angleSensorKY);
        }
 
        Double temperature = entity.getTemperature();
        if (temperature != null) {
            stmt.bindDouble(26, temperature);
        }
 
        Integer wheelResolution = entity.getWheelResolution();
        if (wheelResolution != null) {
            stmt.bindLong(27, wheelResolution);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BaseReferInfo readEntity(Cursor cursor, int offset) {
        BaseReferInfo entity = new BaseReferInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // meaInstrumentID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // meaHandBookID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userDepartment
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // materialRef
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // lenCD
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // lenAE
            cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7), // lenBF
            cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8), // lenH
            cursor.isNull(offset + 9) ? null : cursor.getDouble(offset + 9), // wheelDiameter
            cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10), // lenAC
            cursor.isNull(offset + 11) ? null : cursor.getDouble(offset + 11), // lenBD
            cursor.isNull(offset + 12) ? null : cursor.getDouble(offset + 12), // lenAB
            cursor.isNull(offset + 13) ? null : cursor.getDouble(offset + 13), // lenEO
            cursor.isNull(offset + 14) ? null : cursor.getDouble(offset + 14), // lenFO
            cursor.isNull(offset + 15) ? null : cursor.getDouble(offset + 15), // distSensorAT
            cursor.isNull(offset + 16) ? null : cursor.getDouble(offset + 16), // distSensorBT
            cursor.isNull(offset + 17) ? null : cursor.getDouble(offset + 17), // distSensorCT
            cursor.isNull(offset + 18) ? null : cursor.getDouble(offset + 18), // distSensorDT
            cursor.isNull(offset + 19) ? null : cursor.getDouble(offset + 19), // leftDistSensorKL
            cursor.isNull(offset + 20) ? null : cursor.getDouble(offset + 20), // rightDistSensorKR
            cursor.isNull(offset + 21) ? null : cursor.getDouble(offset + 21), // angleSensorXT
            cursor.isNull(offset + 22) ? null : cursor.getDouble(offset + 22), // angleSensorYT
            cursor.isNull(offset + 23) ? null : cursor.getDouble(offset + 23), // angleSensorKX
            cursor.isNull(offset + 24) ? null : cursor.getDouble(offset + 24), // angleSensorKY
            cursor.isNull(offset + 25) ? null : cursor.getDouble(offset + 25), // temperature
            cursor.isNull(offset + 26) ? null : cursor.getInt(offset + 26) // wheelResolution
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BaseReferInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMeaInstrumentID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMeaHandBookID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserDepartment(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMaterialRef(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setLenCD(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setLenAE(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setLenBF(cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7));
        entity.setLenH(cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8));
        entity.setWheelDiameter(cursor.isNull(offset + 9) ? null : cursor.getDouble(offset + 9));
        entity.setLenAC(cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10));
        entity.setLenBD(cursor.isNull(offset + 11) ? null : cursor.getDouble(offset + 11));
        entity.setLenAB(cursor.isNull(offset + 12) ? null : cursor.getDouble(offset + 12));
        entity.setLenEO(cursor.isNull(offset + 13) ? null : cursor.getDouble(offset + 13));
        entity.setLenFO(cursor.isNull(offset + 14) ? null : cursor.getDouble(offset + 14));
        entity.setDistSensorAT(cursor.isNull(offset + 15) ? null : cursor.getDouble(offset + 15));
        entity.setDistSensorBT(cursor.isNull(offset + 16) ? null : cursor.getDouble(offset + 16));
        entity.setDistSensorCT(cursor.isNull(offset + 17) ? null : cursor.getDouble(offset + 17));
        entity.setDistSensorDT(cursor.isNull(offset + 18) ? null : cursor.getDouble(offset + 18));
        entity.setLeftDistSensorKL(cursor.isNull(offset + 19) ? null : cursor.getDouble(offset + 19));
        entity.setRightDistSensorKR(cursor.isNull(offset + 20) ? null : cursor.getDouble(offset + 20));
        entity.setAngleSensorXT(cursor.isNull(offset + 21) ? null : cursor.getDouble(offset + 21));
        entity.setAngleSensorYT(cursor.isNull(offset + 22) ? null : cursor.getDouble(offset + 22));
        entity.setAngleSensorKX(cursor.isNull(offset + 23) ? null : cursor.getDouble(offset + 23));
        entity.setAngleSensorKY(cursor.isNull(offset + 24) ? null : cursor.getDouble(offset + 24));
        entity.setTemperature(cursor.isNull(offset + 25) ? null : cursor.getDouble(offset + 25));
        entity.setWheelResolution(cursor.isNull(offset + 26) ? null : cursor.getInt(offset + 26));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BaseReferInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BaseReferInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BaseReferInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
