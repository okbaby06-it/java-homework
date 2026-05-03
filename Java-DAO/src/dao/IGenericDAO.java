package dao;

//T, K là ký tự(có thể đổi tên bất kỳ) đại diện cho một kiểu dữ liệu
//T, đại diện cho class (Student, Course,...)
//K, đại diện cho khóa chính
public interface IGenericDAO<T, K> {
    //cac phuong thuc CRUD (Create - Insert / Read / Update / Delete)
    void insert(T entity);
    void update(T entity);
    void delete(K id);


}
