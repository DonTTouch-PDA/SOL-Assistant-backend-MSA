//package com.donttouch.chart_similarity_service.domain.my_stock.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "signal_sell")
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class SignalSell {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "sell_id")
//    private Long sellId;
//
//    @Column(name = "stock_code", nullable = false)
//    private String stockCode;
//
//    @Column(name = "stock_name", nullable = false)  // ✅ 새로 추가
//    private String stockName;
//
//    @Column(name = "signal_id", nullable = false)
//    private Long signalId;
//
//    @Column(name = "today_date")
//    private LocalDateTime todayDate;
//
//    @Column(name = "past_date")
//    private LocalDateTime pastDate;
//
//    @Column(name = "today_close")
//    private Double todayClose;
//
//    @Column(name = "change_rate")
//    private Double changeRate;   // ✅ 증감률 (예: +3.25, -1.5)
//
//    @Column(name = "today_volume")
//    private Double todayVolume;
//
//    @Column(name = "trend_today", columnDefinition = "TEXT")
//    private String trendToday;
//
//    @Column(name = "trend_past_scaled", columnDefinition = "TEXT")
//    private String trendPastScaled;
//
//    @Column(name = "created_at")
//    private LocalDateTime createdAt;
//}

package com.donttouch.chart_similarity_service.domain.my_stock.entity;

import com.donttouch.chart_similarity_service.domain.stock.entity.SignalExplain;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name = "signal_buy")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignalSell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sell_id")
    private Long sellId;

    @Column(name = "stock_code", nullable = false)
    private String stockCode;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "signal_id", nullable = false)
    private Long signalId;

    @Column(name = "today_date")
    private LocalDateTime todayDate;

    @Column(name = "past_date")
    private LocalDateTime pastDate;

    @Column(name = "today_close")
    private Double todayClose;

    @Column(name = "change_rate")
    private Double changeRate;

    @Column(name = "today_volume")
    private Double todayVolume;

    @Column(name = "trend_today", columnDefinition = "LONGTEXT")
    private String trendToday;

    @Column(name = "trend_past_scaled", columnDefinition = "LONGTEXT")
    private String trendPastScaled;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
