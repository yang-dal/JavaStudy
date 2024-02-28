package generictypeusage;

import java.io.Serializable;

// 제네릭을 적용하여 여러가지 데이터 타입을 다룰 수 있는 DTO 클래스
// 타입 T 대신 어떤 타입명이든 사용할 수 있음 (내부적으로 일관적이기만 하면 됨)
public class GenericDTO<MyGenericParameterType> implements Serializable {
    private MyGenericParameterType object;

    public void setObject(MyGenericParameterType object) {
        this.object = object;
    }

    public MyGenericParameterType getObject() {
        return object;
    }
}