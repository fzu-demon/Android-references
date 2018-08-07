package me.shouheng.commons.config;

/**
 * Created by WngShhng on 2018/6/7.*/
public interface BaseConstants {

    // region request codes
    int REQUEST_PERMISSION_STORAGE = 0x0006;
    int REQUEST_PERMISSION_PHONE_STATE = 0x0007;
    int REQUEST_PERMISSION_LOCATION = 0x0008;
    int REQUEST_PERMISSION_MICROPHONE = 0x0009;
    int REQUEST_PERMISSION_SMS = 0x000A;
    int REQUEST_PERMISSION_SENSORS = 0x000B;
    int REQUEST_PERMISSION_CONTACTS = 0x000C;
    int REQUEST_PERMISSION_CAMERA = 0x000D;
    int REQUEST_PERMISSION_CALENDAR = 0x000E;
    // endregion

    String INTRO = "/app/intro";

    String LIVE_HOME = "/live/home";
    String LIVE_DETAIL = "/live/detail";
    String LIVE_DETAIL_EXTRA_ROOM_TYPE = "__extra_room_type";
    String LIVE_DETAIL_EXTRA_UID = "__extra_uid";
    String LIVE_DETAIL_EXTRA_THUMB = "__extra_thumb";
    String LIVE_DETAIL_FULL_SCREEN = "/live/detail/fullscreen";
    String LIVE_DETAIL_FULL_SCREEN_EXTRA_KEY_UID = "__extra_uid";
    String LIVE_DETAIL_FULL_SCREEN_EXTRA_KEY_THUMB = "__extra_thumb";
    String LIVE_DETAIL_ROOM = "/live/detail/room";
    String LIVE_DETAIL_ROOM_EXTRA_KEY_UID = "__extra_uid";
    String LIVE_DETAIL_ROOM_EXTRA_KEY_THUMB = "__extra_thumb";

    String GUOKR_NEWS = "/guokr/news";
    String GUOKR_NEWS_LIST = "/guokr/news/list";
    String GUOKR_NEWS_DETAIL = "/guokr/news/detail";
    String GUOKR_NEWS_DETAIL_EXTRA_KEY_ARTICLE_ID = "__extra_article_id";
    String GUOKR_NEWS_DETAIL_EXTRA_KEY_ARTICLE_TITLE = "__extra_article_title";

    String LAYOUT_NORMAL_FRAGMENT = "/layout/normal_fragment";
    String LAYOUT_NORMAL_FRAGMENT_EXTRA_TITLE = "__extra_title";
    String LAYOUT_NORMAL_FRAGMENT_EXTRA_CONTENT = "__extra_content";
    String LAYOUT_NORMAL_FRAGMENT_EXTRA_SHOW_TOOLBAR = "__extra_show_toolbar";
    String LAYOUT_NAVIGATION = "/layout/navigation";
    String LAYOUT_BOTTOM_SHEET = "/layout/bottom_sheet";
    String LAYOUT_COLLAPSE_BAR = "/layout/collapse_bar";
    String LAYOUT_SCROLLING = "/layout/scrolling";
    String LAYOUT_TABBED = "/layout/tabbed";
    String LAYOUT_MENU = "/layout/menu";
    String LAYOUT_PAGER_FRAGMENT = "/layout/pager";

    String LIBRARY_MENU = "/library/menu";
    String LIBRARY_EVENT_BUS_ACTIVITY1 = "/library/event_bus/activity1";
    String LIBRARY_EVENT_BUS_ACTIVITY2 = "/library/event_bus/activity2";
    String LIBRARY_RX_JAVA = "/library/rxjava";
}