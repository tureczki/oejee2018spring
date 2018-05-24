package org.tureczki.projectmico.weblayer;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class SystemConfigManagement {
    private static final int DEFAULT_NO_THREADS=10;
    private static final String DEFAULT_SCHEMA="default";

    public static void Register() throws MalformedObjectNameException, InterruptedException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        SystemConfig mBean = new SystemConfig(DEFAULT_NO_THREADS, DEFAULT_SCHEMA);
        ObjectName name = new ObjectName("org.tureczki.projectmico.jmx:type=SystemConfig");
        mbs.registerMBean(mBean, name);
        
    }

}