package com.knightliao.canalx.plugin.router.rest.support.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.knightliao.canalx.core.support.context.ICanalxContext;

import lombok.Data;

/**
 * @author knightliao
 * @date 2016/12/2 18:53
 */
@Data
public class RouterRestConfig {

    protected static final Logger LOGGER = LoggerFactory.getLogger(RouterRestConfig.class);

    private int serverPort = 8888;

    private String dataSource = "";

    public void initConfig(ICanalxContext iCanalxContext) throws Exception {

        // port
        String port = iCanalxContext.getProperty("canalx.plugin.router.port");

        //
        String dataSource = iCanalxContext.getProperty("canalx.plugin.router.datasource");

        serverPort = Integer.parseInt(port);
        this.dataSource = dataSource;

        LOGGER.debug("router config: port:{}, dataSource:{}", port, dataSource);
    }
}
