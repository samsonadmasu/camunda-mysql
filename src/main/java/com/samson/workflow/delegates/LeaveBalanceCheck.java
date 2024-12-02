package com.samson.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class LeaveBalanceCheck implements JavaDelegate {
    public static final int LEAVE_BALANCE = 5;
    private static final Logger log = LoggerFactory.getLogger(LeaveBalanceCheck.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        if(LEAVE_BALANCE > 0) {
            log.info("Leave balance is enough");
        } else {
            log.error("Not enough leave balance");
        }
    }
}
