package cn.lyxlz.fastfs.constant;


/**
 * 文件类型枚举
 *
 * @author xlz
 * @date 2023/09/02
 */
public enum FileTypeEnum {

    /**
     * 文件类型
     */
    PPT("ppt"),
    PPTX("pptx"),
    DOC("doc"),
    DOCX("docx"),
    XLS("xls"),
    XLSX("xlsx"),
    PDF("pdf"),
    HTML("html"),
    HTM("htm"),
    TXT("txt"),
    TEXT("text"),
    SWF("swf"),
    FLASH("flash"),
    ZIP("zip"),
    RAR("rar"),
    SEVENZ("7z"),
    AUDIO("audio"),
    MP3("mp3"),
    VIDEO("video"),
    MP4("mp4"),
    FILE("file"),
    IMAGE("image"),
    APPLICATION("application");

    private String name;

    FileTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
