package com.Actvidad_2.Actividad_2.time.serialization;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.function.Function;

public class ValueAdapter<T extends ValueSerializer> implements GsonAdapter<T>{

    private final Function<Integer, T> factory;

    public ValueAdapter(Function<Integer, T> factory){
        this.factory = factory;
    }


    @Override
    public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return factory.apply(value);
    }

    @Override
    public JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = t.valueof();
        return new JsonPrimitive(value);
    }
}
