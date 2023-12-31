package asd.homemaestro.Services.Devices.Actuators;

import asd.Utils.ActuatorType;
import asd.Utils.Consts;
import asd.homemaestro.Entities.Devices.Actuators.AcActuator;
import asd.homemaestro.Entities.Devices.Actuators.Actuator;
import asd.homemaestro.Entities.Devices.Sensors.Sensor;
import asd.homemaestro.Entities.Devices.Sensors.TemperatureSensor;
import asd.homemaestro.Services.Devices.Sensors.TemperatureSensorFactory;
import org.json.JSONObject;

public class ActuatorFactory implements IActuatorFactory{

    @Override
    public Actuator CreateActuatorFromJson(JSONObject jsonObject) {
        Actuator actuator = null;
        if(jsonObject.get(Consts.JSONTYPE).toString().equalsIgnoreCase(AcActuator.class.getSimpleName())){
            AcActuatorFactory acActuatorFactory = new AcActuatorFactory();
            actuator = acActuatorFactory.CreateAcActuator(jsonObject);
        }
        return actuator;
    }
}
