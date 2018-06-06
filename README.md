#  cloud-demo

---
1. 本项目主要展示了使用spring cloud 进行模块化开发。
2. 每个项目既是一个模块。
3. 项目的核心在common包，该包包含了该系统所有的api接口，每个模块都引用了common包，可以根据需要调用
4. 本项目使用了 jpa+h2，不需要本地的数据库配置，直接运行即可。
5. 使用jpa的@Entity时，注意到除了id主键，其他字段顺序是根据字母正序排列
> [jpa使用@Entity自动建表的字段顺序问题](https://blog.csdn.net/hkawei/article/details/71552691)
6. 在需要被外部访问的 webapp模块引入了security进行权限控制
---
> ps: 其他cloud的功能模块，如网关zull，断路器Hystrix，依赖关系追踪sleuth,远程配置config等可以根据需要随意拓展.具体请参考 [spring官网](https://spring.io/docs/reference)
