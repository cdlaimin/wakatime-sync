package com.wf2311.wakatime.sync.repository;

import com.wf2311.wakatime.sync.entity.DayLanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author <a href="mailto:wf2311@163.com">wf2311</a>
 * @since 2019-01-10 14:22.
 */
public interface DayLanguageRepository extends JpaRepository<DayLanguageEntity, Long>, DaySummaryQueryHandler<DayLanguageEntity> {
}
