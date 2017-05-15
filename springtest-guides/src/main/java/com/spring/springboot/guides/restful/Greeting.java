package com.spring.springboot.guides.restful;

/**
 * @version Ver 1.0
 * @Author <a href="mailto:jeffreyji@yeah.net">jeffrey</a>
 * @Date 2016/5/13 15:55.
 */
public class Greeting {
    private final long id ;
    private final String content;

    Greeting(long _id,String _content){
        this.id = _id;
        this.content = _content;

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
