package djf;

/**
 * This enum provides properties that are to be loaded via
 * XML files to be used for setting up the application.
 * 
 * @author Richard McKenna
 * @version 1.0
 */
@SuppressWarnings("unused")
public enum AppPropertyType {

    // LOADED PROGRAMMICALLY AT THE START OF THE APPLICATION
    // AND THEN OVERRIDDEN BY LANGUAGE-SPECIFIC XML FILES
    APP_ERROR_TITLE,
    APP_ERROR_CONTENT,
    PROPERTIES_ERROR_TITLE,
    PROPERTIES_ERROR_CONTENT,

    // LOADED FROM app_properties.xml
        
    // FOR GETTING THE LIST OF LANGUAGE CHOICES
    LANGUAGE_OPTIONS,
    DEFAULT_LANGUAGE,
    LANGUAGE_DIALOG_TITLE,
    LANGUAGE_DIALOG_HEADER_TEXT,
    LANGUAGE_DIALOG_CONTENT_TEXT,

    // INITIAL WINDOW TITLE AND LOGO
    APP_TITLE,
    APP_LOGO,
    APP_PATH_CSS,
    APP_CSS,
    WORK_FILE_EXT,
    WORK_FILE_EXT_DESC,
    PREF_WIDTH,
    PREF_HEIGHT,
    START_MAXIMIZED,
    CLOSE_BUTTON_TEXT,
    
    // FOR DETERMINING WHICH TOP TOOLBARS ARE BEING USED
    HAS_TOP_TOOLBAR,
    HAS_FILE_TOOLBAR, 
    HAS_NEW, HAS_LOAD, HAS_CLOSE, HAS_SAVE, HAS_SAVE_AS, HAS_EXPORT, HAS_EXIT,
    HAS_CUT_TOOLBAR,
    HAS_UNDO_TOOLBAR,
    HAS_SETTINGS_TOOLBAR,
    HAS_LANGUAGE, HAS_HELP, HAS_ABOUT,

    // FILE TOOLBAR ICONS
    NEW_ICON,
    LOAD_ICON,
    CLOSE_ICON,
    SAVE_ICON,
    SAVE_AS_ICON,
    EXPORT_ICON,
    EXIT_ICON,
    
    // CUT/COPY/PASTE TOOLBAR ICONS
    CUT_ICON,
    COPY_ICON,
    PASTE_ICON,
    
    // UNDO/REDO TOOLBAR ICONS
    UNDO_ICON,
    REDO_ICON,
    
    // SETTINGS/HELP/ABOUT TOOLBAR ICONS
    SETTINGS_ICON,
    HELP_ICON,
    ABOUT_ICON,
    
    // LOADED FROM LANGUAGE SPECIFIC language_properties_XX.xml
    // WHERE XX WOULD BE THE LANGUAGE CODE, LIKE EN (English)

    // FILE TOOLBAR TOOLTIPS - SHOULD BE LOADED VIA
    // A LANGUAGE-SPECIFIC XML FILE
    NEW_TOOLTIP,
    LOAD_TOOLTIP,
    CLOSE_TOOLTIP,
    SAVE_TOOLTIP,
    SAVE_AS_TOOLTIP,
    EXPORT_TOOLTIP,
    EXIT_TOOLTIP,
    
    // CUT/COPY/PASTE TOOLBAR TOOLTIPS - SHOULD BE LOADED VIA
    // A LANGUAGE-SPECIFIC XML FILE
    CUT_TOOLTIP,
    COPY_TOOLTIP,
    PASTE_TOOLTIP,
    
    // UNDO/REDO TOOLBAR TOOLTIPS - SHOULD BE LOADED VIA
    // A LANGUAGE-SPECIFIC XML FILE
    UNDO_TOOLTIP,
    REDO_TOOLTIP,    
    
    // SETTINGS/HELP/ABOUT TOOLBAR TOOLTIPS - SHOULD BE LOADED VIA
    // A LANGUAGE-SPECIFIC XML FILE
    SETTINGS_TOOLTIP,
    HELP_TOOLTIP,
    ABOUT_TOOLTIP,
    
    // NEW FEEDBACK DIALOGS
    NEW_SUCCESS_TITLE,
    NEW_SUCCESS_CONTENT,
    NEW_ERROR_TITLE,
    NEW_ERROR_CONTENT,
    
    // LOAD FEEDBACK DIALOGS
    LOAD_WORK_TITLE,
    LOAD_SUCCESS_TITLE,
    LOAD_SUCCESS_CONTENT,
    LOAD_ERROR_TITLE,
    LOAD_ERROR_CONTENT,
    
    // SAVE FEEDBACK DIALOGS
    SAVE_WORK_TITLE,
    SAVE_SUCCESS_TITLE,
    SAVE_SUCCESS_CONTENT,
    SAVE_ERROR_TITLE,
    SAVE_ERROR_CONTENT,
    SAVE_VERIFY_TITLE,
    SAVE_VERIFY_CONTENT,

    // ABOUT DIALOG
    ABOUT_TITLE,
    ABOUT_CONTENT
}