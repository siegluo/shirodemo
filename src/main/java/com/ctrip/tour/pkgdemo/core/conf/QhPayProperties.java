package com.ctrip.tour.pkgdemo.core.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "net.kingsilk.qh.pay")
public class QhPayProperties {

}
