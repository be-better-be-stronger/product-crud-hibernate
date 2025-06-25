package util;

import exceptions.AppException;

public class ValidateUtil {
	// Kiểm tra số nguyên
    public static int parsePositiveInt(String input, String fieldName) {
        try {
            int value = Integer.parseInt(input.trim());
            if (value < 0) {
                throw new AppException("Trường '" + fieldName + "' không được âm.");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new AppException("Trường '" + fieldName + "' phải là số nguyên hợp lệ.");
        }
    }

    // Kiểm tra số thực
    public static double parsePositiveDouble(String input, String fieldName) {
        try {
            double value = Double.parseDouble(input.trim());
            if (value < 0) {
                throw new AppException("Trường '" + fieldName + "' không được âm.");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new AppException("Trường '" + fieldName + "' phải là số thực hợp lệ.");
        }
    }
}
