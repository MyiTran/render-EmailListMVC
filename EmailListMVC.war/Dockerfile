# Dùng image Tomcat 9 có sẵn
FROM tomcat:9.0

# Xóa app mặc định
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy file WAR (bạn export từ Eclipse) vào Tomcat
COPY target/EmailListMVC.war /usr/local/tomcat/webapps/ROOT.war

# Expose port
EXPOSE 8080

# Chạy Tomcat
CMD ["catalina.sh", "run"]
