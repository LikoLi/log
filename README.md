### Log
> Log 有六个级别, 分别是: fatal(致命的), error, warn, info, debug, trace(堆栈)

### Log4j 的日志输出控制文件, 主要由三个部分组成:
- 日志信息的输出位置
- 日志信息的输出格式
- 日志信息的输出级别

## 使用[-Dlog4j.debug] 这个 VM arguments 可以看到log4j读取配置文件的过程

### Log4j 配置
- 首先需要配置root loger
```
log4j.rootLogger=info,console//info 级别, console appender name
```

- 配置一个appender
```
# Define an appender named console
log4j.appender.console=org.apache.log4j.ConsoleAppender
```

- 配置输出地址
```
# The Target value is System.out or System.err
log4j.appender.console.Target=System.err
```

- 配置输出layout
```
# Set the layout type of the appender
log4j.appender.console.layout=org.apache.log4j.PatternLayout
```

- 配置layout 格式
```
# Set the layout format pattern
log4j.appender.console.layout.ConversionPattern=[%-5p]
```
