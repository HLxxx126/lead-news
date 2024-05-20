package com.heima.wemedia.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.classification.InterfaceAudience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author HLxxx
 * @version 1.0
 */

public interface WmNewsAutoScanService {
    public void autoScanWmNews(Integer id);

}
