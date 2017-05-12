1 springboot 自动配置
    Spring Boot 不单单从 application.properties 获取配置，所以我们可以在程序中多种设置配置属性。按照以下列表的优先级排列：
    1.命令行参数
    2.java:comp/env 里的 JNDI 属性
    3.JVM 系统属性
    4.操作系统环境变量
    5.RandomValuePropertySource 属性类生成的 random.* 属性
    6.应用以外的 application.properties（或 yml）文件
    7.打包在应用内的 application.properties（或 yml）文件
    8.在应用 @Configuration 配置类中，用 @PropertySource 注解声明的属性文件
    9.SpringApplication.setDefaultProperties 声明的默认属性

注意：配置文件必须在resources的根目录下