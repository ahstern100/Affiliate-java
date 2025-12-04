package com.example.myproject;

// ייבוא מחלקות הלוגים הדרושות
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp {

    // הגדרת הלוגר עבור המחלקה הנוכחית.
    // השימוש ב-private static final הוא נוהג מומלץ.
    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        
        // כתיבת "הלו וורלד" כהודעת מידע (INFO)
        // הודעה זו תופיע בלוג של GitHub ובלוג הקונסולה המקומית.
        logger.info("Hello, GitHub and Java World!");
        
        // דוגמאות לרמות לוג שונות
        logger.debug("זו הודעת Debug, ייתכן שלא תופיע בהגדרות ברירת מחדל.");
        logger.warn("אזהרה: יש לבדוק את הגדרות המערכת.");
        logger.error("שגיאה קריטית: משהו השתבש, זה יופיע בוודאות.");
        
        // עדיין אפשר להשתמש ב-System.out.println, אך מומלץ להשתמש ב-logger
        System.out.println("זה פלט רגיל של System.out, יופיע בלוג ללא פורמט הלוגר.");
    }
}
