package com.Actvidad_2.Actividad_2.time.serialization;

import com.Actvidad_2.Actividad_2.time.domain.Hours;
import com.google.gson.*;

import java.lang.reflect.Type;

public class adacterHours implements JsonSerializer<Hours>, JsonDeserializer<Hours>{

    @Override
    public Hours deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Hours.of(value);
    }

    @Override
    public JsonElement serialize(Hours hours, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = hours.getValue();
        return new JsonPrimitive(value);
    }
}
