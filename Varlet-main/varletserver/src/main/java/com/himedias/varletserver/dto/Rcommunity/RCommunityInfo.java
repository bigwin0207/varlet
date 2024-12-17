package com.himedias.varletserver.dto.Rcommunity;

import com.himedias.varletserver.entity.MemberRole;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Projection for {@link com.himedias.varletserver.entity.RCommunity}
 */

public interface RCommunityInfo {
    int getRnum();

    int getLocation();

    int getLocation2();

    int getViews();

    String getTitle();

    String getContent();

    int getReward();

    char getPicked();

    LocalDateTime getWritedate();

    LocalDateTime getStartdate();

    LocalDateTime getEnddate();

    MemberInfo getUserid();

    /**
     * Projection for {@link com.himedias.varletserver.entity.Member}
     */
    interface MemberInfo {
        String getUserid();

        String getName();

        String getNickname();

        String getSnsid();

        String getProfileimg();

        List<MemberRole> getMemberRoleList();
    }
}