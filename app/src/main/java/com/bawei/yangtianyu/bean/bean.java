package com.bawei.yangtianyu.bean;


import java.util.List;

/*
 *@Auther:杨天宇
 *@Date: 2019/6/11
 *@Time:9:23
 *@Description:功能 * */
public class bean {



    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {


        private String type;
        private String text;
        private String user_id;
        private String name;
        private String screen_name;
        private String profile_image;
        private String created_at;
        private Object create_time;
        private String passtime;
        private String love;
        private String hate;
        private String comment;
        private String repost;
        private String bookmark;
        private String bimageuri;
        private Object voiceuri;
        private Object voicetime;
        private Object voicelength;
        private String status;
        private String theme_id;
        private String theme_name;
        private String theme_type;
        private String videouri;
        private int videotime;
        private String original_pid;
        private int cache_version;
        private Object playcount;
        private Object playfcount;
        private String cai;
        private Object weixin_url;
        private Object image1;
        private Object image2;
        private Object is_gif;
        private Object image0;
        private Object image_small;
        private Object cdn_img;
        private String width;
        private String height;
        private String tag;
        private int t;
        private String ding;
        private String favourite;
        private Object top_cmt;
        private Object themes;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getScreen_name() {
            return screen_name;
        }

        public void setScreen_name(String screen_name) {
            this.screen_name = screen_name;
        }

        public String getProfile_image() {
            return profile_image;
        }

        public void setProfile_image(String profile_image) {
            this.profile_image = profile_image;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public Object getCreate_time() {
            return create_time;
        }

        public void setCreate_time(Object create_time) {
            this.create_time = create_time;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }

        public String getLove() {
            return love;
        }

        public void setLove(String love) {
            this.love = love;
        }

        public String getHate() {
            return hate;
        }

        public void setHate(String hate) {
            this.hate = hate;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getRepost() {
            return repost;
        }

        public void setRepost(String repost) {
            this.repost = repost;
        }

        public String getBookmark() {
            return bookmark;
        }

        public void setBookmark(String bookmark) {
            this.bookmark = bookmark;
        }

        public String getBimageuri() {
            return bimageuri;
        }

        public void setBimageuri(String bimageuri) {
            this.bimageuri = bimageuri;
        }

        public Object getVoiceuri() {
            return voiceuri;
        }

        public void setVoiceuri(Object voiceuri) {
            this.voiceuri = voiceuri;
        }

        public Object getVoicetime() {
            return voicetime;
        }

        public void setVoicetime(Object voicetime) {
            this.voicetime = voicetime;
        }

        public Object getVoicelength() {
            return voicelength;
        }

        public void setVoicelength(Object voicelength) {
            this.voicelength = voicelength;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTheme_id() {
            return theme_id;
        }

        public void setTheme_id(String theme_id) {
            this.theme_id = theme_id;
        }

        public String getTheme_name() {
            return theme_name;
        }

        public void setTheme_name(String theme_name) {
            this.theme_name = theme_name;
        }

        public String getTheme_type() {
            return theme_type;
        }

        public void setTheme_type(String theme_type) {
            this.theme_type = theme_type;
        }

        public String getVideouri() {
            return videouri;
        }

        public void setVideouri(String videouri) {
            this.videouri = videouri;
        }

        public int getVideotime() {
            return videotime;
        }

        public void setVideotime(int videotime) {
            this.videotime = videotime;
        }

        public String getOriginal_pid() {
            return original_pid;
        }

        public void setOriginal_pid(String original_pid) {
            this.original_pid = original_pid;
        }

        public int getCache_version() {
            return cache_version;
        }

        public void setCache_version(int cache_version) {
            this.cache_version = cache_version;
        }

        public Object getPlaycount() {
            return playcount;
        }

        public void setPlaycount(Object playcount) {
            this.playcount = playcount;
        }

        public Object getPlayfcount() {
            return playfcount;
        }

        public void setPlayfcount(Object playfcount) {
            this.playfcount = playfcount;
        }

        public String getCai() {
            return cai;
        }
   
        public void setCai(String cai) {
            this.cai = cai;
        }

        public Object getWeixin_url() {
            return weixin_url;
        }

        public void setWeixin_url(Object weixin_url) {
            this.weixin_url = weixin_url;
        }

        public Object getImage1() {
            return image1;
        }

        public void setImage1(Object image1) {
            this.image1 = image1;
        }

        public Object getImage2() {
            return image2;
        }

        public void setImage2(Object image2) {
            this.image2 = image2;
        }

        public Object getIs_gif() {
            return is_gif;
        }

        public void setIs_gif(Object is_gif) {
            this.is_gif = is_gif;
        }

        public Object getImage0() {
            return image0;
        }

        public void setImage0(Object image0) {
            this.image0 = image0;
        }

        public Object getImage_small() {
            return image_small;
        }

        public void setImage_small(Object image_small) {
            this.image_small = image_small;
        }

        public Object getCdn_img() {
            return cdn_img;
        }

        public void setCdn_img(Object cdn_img) {
            this.cdn_img = cdn_img;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public int getT() {
            return t;
        }

        public void setT(int t) {
            this.t = t;
        }

        public String getDing() {
            return ding;
        }

        public void setDing(String ding) {
            this.ding = ding;
        }

        public String getFavourite() {
            return favourite;
        }

        public void setFavourite(String favourite) {
            this.favourite = favourite;
        }

        public Object getTop_cmt() {
            return top_cmt;
        }

        public void setTop_cmt(Object top_cmt) {
            this.top_cmt = top_cmt;
        }

        public Object getThemes() {
            return themes;
        }

        public void setThemes(Object themes) {
            this.themes = themes;
        }
    }
}
