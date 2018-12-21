package com.openweather.service.impl;

import com.openweather.model.weatherdata.WeatherData;
import com.openweather.model.weatherdata.weatherdatainfo.Location;
import com.openweather.model.weatherdata.weatherdatainfo.forecast.Time;
import com.openweather.repository.WeatherDataRepository;
import com.openweather.repository.impl.WeatherDataRepositoryImpl;
import com.openweather.service.WeatherDataService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    final static Logger logger = Logger.getLogger(WeatherDataServiceImpl.class);
    private WeatherDataRepository weatherDataRepository = new WeatherDataRepositoryImpl();

    @Override
    public WeatherData getWeatherData() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(WeatherData.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        WeatherData weatherData = (WeatherData) jaxbUnmarshaller.unmarshal(weatherDataRepository.getXMLFile());

        Location location = weatherData.getLocation();

        logger.info("Name : " + location.getName());
        logger.info("Type : " + location.getType());
        logger.info("Country : " + location.getCountry());
        logger.info("Timezone : " + location.getTimezone());
        logger.info("Location Altitude : " + location.getInnerLocation().getAltitude());
        logger.info("Location Latitude : " + location.getInnerLocation().getLatitude());
        logger.info("Location Longitude : " + location.getInnerLocation().getLongitude());
        logger.info("Location Geobase : " + location.getInnerLocation().getGeobase());
        logger.info("Sun Rise : " + weatherData.getSun().getRise());
        logger.info("Sun Set : " + weatherData.getSun().getSet());
        logger.info("Meta Lastupdate : " + weatherData.getMeta().getLastupdate());
        logger.info("Meta Calctime : " + weatherData.getMeta().getCalctime());
        logger.info("Meta Nextupdate : " + weatherData.getMeta().getNextupdate());
        logger.info("Credit : " + weatherData.getCredit());
        for(Time time : weatherData.getForecast().getTime()){
            logger.info("Day : " + time.getDay());
            logger.info("Symbol Number : " + time.getSymbol().getNumber());
            logger.info("Symbol Name : " + time.getSymbol().getName());
            logger.info("Symbol Var : " + time.getSymbol().getVar());
        }

        return weatherData;
    }
}
