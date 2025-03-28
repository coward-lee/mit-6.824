package org.lee.study.db;

public interface DBServiceUseCase {
    boolean set(String key,Object value);
    boolean prepare(String key,Object value);
    boolean rollback(String key,Object value);
    Object get(String key);
}
