package poly.Lab7.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    @Autowired
    HttpSession session;

    /**
     * Đặt giá trị vào session
     * @param name tên thuộc tính
     * @param value giá trị cần lưu
     */
    public void set(String name, Object value) {
        session.setAttribute(name, value);
    }

    /**
     * Lấy giá trị từ session
     * @param name tên thuộc tính
     * @param defaultValue giá trị mặc định nếu không có
     * @param <T> kiểu dữ liệu trả về
     * @return giá trị trong session hoặc giá trị mặc định
     */
    @SuppressWarnings("unchecked")
    public <T> T get(String name, T defaultValue) {
        Object value = session.getAttribute(name);
        return value != null ? (T) value : defaultValue;
    }

    /**
     * Xóa thuộc tính khỏi session
     * @param name tên thuộc tính
     */
    public void remove(String name) {
        session.removeAttribute(name);
    }
}

