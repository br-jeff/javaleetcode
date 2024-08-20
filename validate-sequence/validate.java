class Program {
  public static boolean isValidSubsquence(
      List<Integer> array, List<Integer> sequence) {
       int rightValues = 0;
       boolean result = false;

      for(int i=0; i < array.size(); i++) {
        if(array.get(i) == sequence.get(rightValues)) {
          equals++;
        }

        if(sequence.size() == rightValues) {
          result = true;
          break;
        }
      }

      }
}
