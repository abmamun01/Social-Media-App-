package com.mamunsproject.social_mediaappbeutifull.Model;

public class DashBoardModel {

    int proflile,postImage,save;

    String name,about,like,comment,share;

    public DashBoardModel() {
    }

    public DashBoardModel(int proflile, int postImage, int save, String name, String about, String like, String comment, String share) {
        this.proflile = proflile;
        this.postImage = postImage;
        this.save = save;
        this.name = name;
        this.about = about;
        this.like = like;
        this.comment = comment;
        this.share = share;
    }


    public int getProflile() {
        return proflile;
    }

    public void setProflile(int proflile) {
        this.proflile = proflile;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
