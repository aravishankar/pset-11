import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//To be, or not to be, that is the question:
//Whether 'tis nobler in the mind to suffer
//The slings and arrows of outrageous fortune,
//Or to take arms against a sea of troubles
//And by opposing end them. To die—to sleep,
//No more; and by a sleep to say we end
//The heart-ache and the thousand natural shocks
//That flesh is heir to: 'tis a consummation
//Devoutly to be wish'd. To die, to sleep;
//To sleep, perchance to dream—ay, there's the rub:
//For in that sleep of death what dreams may come,
//When we have shuffled off this mortal coil,
//Must give us pause—there's the respect
//That makes calamity of so long life.
//For who would bear the whips and scorns of time,

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

		int start = 0;
		int mid = 0;
		int end = list.size() - 1;

		while (start <= end) {

			mid = (start + end) / 2;
			if (list.get(mid) < target) {
				start = mid + 1;
			} else if (list.get(mid) > target) {
				end = mid - 1;
			} else if (list.get(mid) == target) {
				return mid;
			}
		}

		return -1;
	}

	public int findMeFaster(String[] list, String target) {

		if (list == null || list.length == 0 || target.equals(null)) {
			return -1;
		}

		int start = 0;
		int mid = 0;
		int end = list.length;

		while (start <= end) {

			mid = (start + end) / 2;
			if (list[mid].compareTo(target) < 0) {
				start = mid + 1;
			} else if (list[mid].compareTo(target) > 0) {
				end = mid - 1;
			} else if (list[mid].compareTo(target) == 0) {
				return mid;
			}
		}

		return -1;
	}

	public int[] bubble(int[] list, boolean ascending) {

		if (list == null || list.length == 0) {
			return null;
		}

		if (ascending) {

			for (int i = 0; i < list.length - 1; i++) {

				for (int j = 0; j < list.length - 1 - i; j++) {

					if (list[j] > list[j + 1]) {
						int temp = list[j];
						list[j] = list[j + 1];
						list[j + 1] = temp;
					}
				}
			}

		} else if (!ascending) {

			for (int i = list.length; i > 1; i--) {

				for (int j = list.length - 1; j > 0; j--) {

					if (list[j] > list[j - 1]) {
						int temp = list[j];
						list[j] = list[j - 1];
						list[j - 1] = temp;
					}
				}
			}

		}

		return list;
	}

	public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {

		if (list == null || list.size() == 0) {
			return null;
		}

		if (ascending) {

			for (int i = 0; i < list.size() - 1; i++) {

				for (int j = 0; j < list.size() - 1 - i; j++) {

					if (list.get(j).compareTo(list.get(j + 1)) > 0) {
						String temp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, temp);
					}
				}
			}

		} else if (!ascending) {

			for (int i = list.size(); i > 1; i--) {

				for (int j = list.size() - 1; j > 0; j--) {

					if (list.get(j).compareTo(list.get(j - 1)) > 0) {
						String temp = list.get(j);
						list.set(j, list.get(j - 1));
						list.set(j - 1, temp);
					}
				}
			}

		}

		return list;
	}

	public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {

		if (list == null || list.size() == 0) {
			return null;
		}

		if (ascending) {

			for (int i = 1; i < list.size(); i++) {

				int key = list.get(i);
				for (int j = i - 1; j >= 0; j--) {

					if (key < list.get(j)) {
						list.set(j + 1, list.get(j));
						if (j == 0) {
							list.set(0, key);
						}
					} else {
						list.set(j + 1, key);
						break;
					}
				}
			}

		} else if (!ascending) {

			for (int i = 1; i < list.size(); i++) {

				int key = list.get(i);
				for (int j = i - 1; j >= 0; j--) {

					if (key > list.get(j)) {
						list.set(j + 1, list.get(j));
						if (j == 0) {
							list.set(0, key);
						}
					} else {
						list.set(j + 1, key);
						break;
					}
				}
			}

		}

		return list;
	}

	public String[] insertion(String[] list, boolean ascending) {

		if (list == null || list.length == 0) {
			return null;
		}

		String temp;

		if (ascending) {

			for (int i = 1; i < list.length; i++) {

				temp = list[i];
				int j = 0;
				for (j = i; j > 0; j--) {

					if (temp.compareTo(list[j - 1]) < 0) {
						list[j] = list[j - 1];
					} else {
						break;
					}

					list[j] = temp;
				}
			}

		} else if (!ascending) {

			for (int i = 1; i < list.length; i++) {

				temp = list[i];
				int j = 0;
				for (j = i; j > 0; j--) {
					if (temp.compareTo(list[j - 1]) > 0) {
						list[j] = list[j - 1];
					} else {
						break;
					}
					list[j] = temp;
				}
			}
		}

		return list;
	}

	public int[] selection(int[] list, boolean ascending) {

		if (list == null || list.length == 0) {
			return null;
		}

		int temp;
		if (ascending) {

			for (int i = 0; i < list.length - 1; i++) {

				int index = i;
				for (int j = i + 1; j < list.length; j++) {

					if (list[j] < list[index]) {
						index = j;
					}
				}

				int smallerNumber = list[index];
				list[index] = list[i];
				list[i] = smallerNumber;
			}

		} else if (!ascending) {

			for (int i = 0; i < list.length - 1; i++) {

				int index = i;
				for (int j = i + 1; j < list.length; j++) {

					if (list[j] > list[index]) {
						index = j;
					}
				}

				int smallerNumber = list[index];
				list[index] = list[i];
				list[i] = smallerNumber;
			}

		}

		return list;
	}

	public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {

		if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
			return null;
		}

		for (int i = 0; i < list.size(); i++) {

			String smallest = list.get(i);
			int smallestIndex = i;
			for (int j = i; j < list.size(); j++) {

				String value = list.get(j);
				if (value.compareTo(smallest) < 0) {
					smallest = value;
					smallestIndex = j;
				}
			}

			if (smallestIndex != i) {
				String head = list.get(i);
				list.set(i, smallest);
				list.set(smallestIndex, head);
			}

		}

		return list;
	}

	public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {

		if (list == null || list.size() == 0) {
			return null;
		}

		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int mid;

		if (list.size() == 1) {
			return list;
		} else {
			mid = list.size() / 2;
			for (int i = 0; i < mid; i++) {
				left.add(list.get(i));
			}

			for (int i = mid; i < list.size(); i++) {
				right.add(list.get(i));
			}

			left = merge(left, true);
			right = merge(right, true);
			int leftIndex = 0;
			int rightIndex = 0;
			int completeArrayIndex = 0;
			
			while (leftIndex < left.size() && rightIndex < right.size()) {
				
				if ((left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
					list.set(completeArrayIndex, left.get(leftIndex));
					leftIndex++;
				} else {
					list.set(completeArrayIndex, right.get(rightIndex));
					rightIndex++;
				}
				completeArrayIndex++;
			}
			
			ArrayList<Integer> other;
			int otherIndex;
			
			if (leftIndex >= left.size()) {
				other = right;
				otherIndex = rightIndex;
			} else {
				other = left;
				otherIndex = leftIndex;
			}

			for (int i = otherIndex; i < other.size(); i++) {
				list.set(completeArrayIndex, other.get(i));
				completeArrayIndex++;
			}
		}

		return list;
	}

	public String[] merge(String[] list, boolean ascending) {

		if (list == null || list.length == 0) {
			return null;
		}

		if (list.length >= 2) {
			String[] left = new String[list.length / 2];
			String[] right = new String[list.length - list.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = list[i];
			}
			
			for (int i = 0; i < right.length; i++) {
				right[i] = list[i + list.length / 2];
			}

			merge(left, true);
			merge(right, true);
			int a = 0;
			int b = 0;
			
			for (int i = 0; i < list.length; i++) {
				if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
					list[i] = left[a];
					a++;
				} else {
					list[i] = right[b];
					b++;
				}
			}
			
		}

		return list;
	}

}