package tk.lexno.shop.dao;

import java.util.List;
import tk.lexno.shop.entity.Announcement;
import tk.lexno.shop.entity.AnnouncementExample;

public interface AnnouncementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    List<Announcement> selectByExample(AnnouncementExample example);

    Announcement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);
}