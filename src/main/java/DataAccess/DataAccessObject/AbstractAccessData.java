package DataAccess.DataAccessObject;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import DataAccess.DatabaseConnector.ConnectManager;

public abstract class AbstractAccessData<T> {
    protected final ConnectManager connectionManager = new ConnectManager();
    protected ResultSetHandler<T> resultSetHandler;
    protected final QueryRunner queryRunner = new QueryRunner();
    protected ResultSetHandler<List<T>> resultSetHandlerList;

    private void getNewConnecttionManager(){
        connectionManager.openConnection();
    }

    private boolean checkUpdateSuccess(int result){
        return result > 0;
    }

    protected T executeQuery(String query, Object... params){
        getNewConnecttionManager();
        try{
            return queryRunner.query(connectionManager.getConnection(), query, resultSetHandler, params);
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            connectionManager.closeConnection();
        }
        return null;
    }

    protected boolean executeUpdate(String query, Object... params){
        getNewConnecttionManager();
        try{
            int result = queryRunner.update(connectionManager.getConnection(), query, params);
            return checkUpdateSuccess(result);
        } catch (SQLException e) {
            System.out.println("Lỗi khi updateQuery: Lỗi" + e.getMessage());
        } finally{
            connectionManager.closeConnection();
        }
        return false;
    }

    protected List<T> executeQueryList(String query, Object... params){
        getNewConnecttionManager();
        try{
            return queryRunner.query(connectionManager.getConnection(), query, resultSetHandlerList, params);
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            connectionManager.closeConnection();
        }
        return null;
    }

    protected void setClazz(Class<T> clazz){
        this.resultSetHandler = new BeanHandler<>(clazz);
        this.resultSetHandlerList = new BeanListHandler<>(clazz);
    }
}
