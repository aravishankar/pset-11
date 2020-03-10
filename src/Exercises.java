import java.util.ArrayList;

public class Exercises {

  public int findMe(int[] list, int target) {

    if (list == null || list.length == 0) {
      return -1;
    }

    for (int i = 0; i < list.length; i++) {
      if (list[i] == target) {
        return i;
      }
    }

    return -1;
  }

  public int findMe(ArrayList<String> list, String target) {
    
    if (list == null || list.size() == 0 || target == null) {
      return -1;
    }

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) {
        return i;
      }
    }

    return -1;
  }

  public int findMeFaster(ArrayList<Integer> list, int target) {
    if (list == null || list.size() == 0) {
      return -1;
    }

    boolean isFound = false;
    int start = 0;
    int end = list.size();

    while (!isFound) {
      int midpoint = (start+end)/2;

      if (list.get(midpoint) == target) {
        return midpoint;
      } else if (list.get(midpoint) < target) {
        end = midpoint;
      } else if (list.get(midpoint) > target) {
        start = midpoint;
      }

    }
    
    return -1;
  }

  public int findMeFaster(String[] list, String target) {
    if (list == null || list.length == 0 || target == null) {
      return -1;
    }

    boolean isFound = false;
    int start = 0;
    int end = list.length;

    while (!isFound) {
      int midpoint = (start + end) / 2;

      if (list[midpoint].equals(target)) {
        return midpoint;
      } else if (list[midpoint].compareTo(target) < 0) {
        end = midpoint;
      } else if (list[midpoint].compareTo(target) > 0) {
        start = midpoint;
      }

    }
    
    
    return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {
    
    if (list == null || list.length == 0) {
      return null;
    }

    int[] arr = list;

    if (ascending) {
      for (int i = 0; i < arr.length -1; i++) {
        for (int j = 0; j < arr.length -1 -i; j++) {
          if (arr[j] > arr[j+1]) { 
            int temp = arr[j]; 
            arr[j] = arr[j+1]; 
            arr[j+1] = temp; 
          } 
        }
      }
    } else if (!ascending) {
      for (int i = arr.length; i > 1; i--) {
        for (int j = arr.length; j > i - 1; j--) {
          if (arr[j] > arr[j - 1]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
          }
        }
      }
    }
    
    return arr;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    
    if (list == null || list.size() == 0) {
      return null;
    }

    ArrayList<String> arr = list;

    if (ascending) {
      for (int i = 0; i < arr.size() -1; i++) {
        for (int j = 0; j < arr.size() - 1 - i; j++) {
          if (arr.get(j).compareTo(arr.get(j+1)) > 0) { 
            String temp = arr.get(j); 
            arr.set(j, arr.get(j+1)); 
            arr.set(j+1, temp); 
          }
        }
      }   
    } else if (!ascending) {
      for (int i = arr.size(); i > 1; i--) {
        for (int j = arr.size(); j > i - 1; j--) {
          if (arr.get(j).compareTo(arr.get(j-1)) > 0) {
            String temp = arr.get(j);
            arr.set(j, arr.get(j - 1));
            arr.set(j - 1, temp);
          }
        }
      }
    }
      
    return arr;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    
    if (list == null || list.size() == 0) {
      return null;
    }

    ArrayList<Integer> arr = list;

    if (ascending) {
      for (int i = 1; i < arr.size(); i++) {
        boolean isSorted = false;

        while (!isSorted) {
          for (int j = i; j >= 0; j--) {
            if (arr.get(i) < arr.get(j)) {
              int saved = arr.get(i);
              for (int k = i-1; k > j; k--) {
                int temp = arr.get(k);
                arr.set(k, arr.get(k-1));
                arr.set(k+1, temp);
              }
              arr.set(j, saved);
              isSorted = true;
              break;
            }
          }
        }
      }
    } else if (!ascending) {
      for (int i = 1; i < arr.size(); i++) {
        boolean isSorted = false;

        while (!isSorted) {
          for (int j = i; j >= 0; j--) {
            if (arr.get(i) > arr.get(j)) {
              int saved = arr.get(i);
              for (int k = i - 1; k > j; k--) {
                int temp = arr.get(k);
                arr.set(k, arr.get(k - 1));
                arr.set(k + 1, temp);
              }
              arr.set(j, saved);
            }
            isSorted = true;
            break;
          }
        }
      }
    }
    
    return null;
  }

  public String[] insertion(String[] list, boolean ascending) {
    
    if (list == null || list.length == 0) {
      return null;
    }

    String[] arr = list;

    if (ascending) {
      for (int i = 1; i < arr.length; i++) {
        boolean isSorted = false;

        while (!isSorted) {
          for (int j = i; j >= 0; j--) {
            if (arr[i].compareTo(arr[j]) < 0) {
              int saved = arr[i];
              for (int k = i - 1; k > j; k--) {
                int temp = arr[k];
                arr[k] = arr[k-1];
                arr[k+1] = temp;
              }
              arr[j] = saved;
              isSorted = true;
              break;
            }
          }
        }
      }
    } else if (!ascending) {
      for (int i = 1; i < arr.length; i++) {
        boolean isSorted = false;

        while (!isSorted) {
          for (int j = i; j >= 0; j--) {
            if (arr[i].compareTo(arr[j]) > 0) {
              int saved = arr[i];
              for (int k = i - 1; k > j; k--) {
                int temp = arr[k];
                arr[k] = arr[k-1];
                arr[k+1] = temp;
              }
              arr[j] = saved;
            }
            isSorted = true;
            break;
          }
        }
      }
    }
    
    return arr;
  }

  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] merge(String[] list, boolean ascending) {
    return null;
  }

}