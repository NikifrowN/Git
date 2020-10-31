import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        final int PATIENTS = 30;
        final int MIN_TEMPERATURE = 32;
        final int MAX_TEMPERATURE = 40;
        final float MIN_HEALTHY_TEMPERATURE = (float) 36.2;
        final float MAX_HEALTHY_TEMPERATURE = (float) 36.9;

        float[] patients = new float[PATIENTS];
        float tempSum = (float) 0.0;
        int healthyPatients = 0;

        DecimalFormat tempFormat = new DecimalFormat("##.#");
        DecimalFormat averageTempFormat = new DecimalFormat("##.##");
        System.out.print("Температуры пациентов: ");
        for (int i = 0; i < patients.length; i++) {
            float temp = ((float) (Math.random()*(MAX_TEMPERATURE - MIN_TEMPERATURE)) + MIN_TEMPERATURE);
            patients[i] = temp;
            tempSum += patients[i];
            if (patients[i] >= MIN_HEALTHY_TEMPERATURE && patients[i] <= MAX_HEALTHY_TEMPERATURE) {
                healthyPatients++;
            }
            System.out.print(tempFormat.format(patients[i]) + " ");
        }
        System.out.println("\nСредня температура: " + averageTempFormat.format(tempSum/patients.length) + "\nКоличество здоровых: " + healthyPatients);
    }
}
