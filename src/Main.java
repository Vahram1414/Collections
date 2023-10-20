import java.util.*;

public class Main {
    private static int[] nums = new int[]{0, 0, 100};
    private static int target = 100;

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(main.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (((HashMap<?, ?>) map).containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

//        System.out.println(Arrays.toString(main.twoSum(nums, target)));
//        System.out.println(main.containsDuplicate(nums));
//    }
//
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("Maksim");
//        arrayList1.add("Pavel");
//        arrayList1.add("Ignat");
//        arrayList1.add(1, "Vahram");
//
//        System.out.println(arrayList1);
//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Yulia");
//        arrayList2.add("Ludmila");
//        arrayList2.add("Natasha");
//
//        System.out.println(arrayList2);
//
//        ArrayList<String> arrayList3 = new ArrayList<>(arrayList2);
//        System.out.println(arrayList3);
//        System.out.println(arrayList1 == arrayList3);
//
//        for (String s : arrayList1) {
//            System.out.print(s + " ");
//
//        }
//        System.out.println();
//        for (int i = 0; i < arrayList1.size(); i++) {
//            System.out.println(arrayList1.get(i));
//        }
//        arrayList2.set(1, "Milana");
//        arrayList1.remove(2);
//        System.out.println(arrayList2);
//        System.out.println(arrayList1);
//    }
//}
//    LinkedList<String> ll = new LinkedList<String>();
//    ll.add("F");
//    ll.add("B");
//    ll.add("D");
//    ll.add("E");
//    ll.add("C");
//    ll.addLast("Z");
//    ll.addFirst("A");
//    ll.add(1, "A2");
//    System.out.println("Исходное содержимое связного списка ll: " + ll);
//    ll.remove("F");
//    ll.remove(2);
//    System.out.println("Исходное содержимое связного списка ll: " + ll);
//    ll.removeFirst();
//    ll.removeLast();
//    System.out.println("Исходное содержимое связного списка ll: " + ll);
//    String val = ll.get(2);
//    ll.set(2, val + " изменено");
//    System.out.println("Содержимое связного списка ll после изменения: " + ll);
//    }
//}
//    ArrayList<Integer> al = new ArrayList<Integer>();
//    al.add(1);
//    al.add(2);
//    al.add(3);
//    al.add(4);
//    System.out.println("Содержимое списочного массива al: " + al);
//    Integer ia[] = new Integer[al.size()];
//    ia = al.toArray(ia);
//    int sum = 0;
//    for (int i : ia) sum += i;
//    System.out.println("Сумма: " + sum);
//    }
//}
//        ArrayList <String> al = new ArrayList<String>();
//        System.out.println("Начальный размер списочного массива al: " + al.size());
//        al.add("C");
//        al.add("A");
//        al.add("E");
//        al.add("B");
//        al.add("D");
//        al.add("F");
//        al.add(1, "A2");
//        System.out.println("размер списочного массива al после ввода элементов: " + al.size());
//
//        System.out.println("Содержимое списочного массива al " + al);
//
//        al.remove("F");
//        al.remove(2);
//
//        System.out.println("Размер списочного массива al после удаления элементов: " + al.size());
//        System.out.println("Содержимое списочного массива al " + al);
//        }
//    }

//public class Main {
//    public static void main(String[] args, UnicodeSet list) {
//        System.out.println("Hello world!");
//        ArrayList List = new ArrayList<>();
//        int[] ArrayList = new int[4];
//        ArrayList[0] = 3;
//        ArrayList[1] = 8;
//        ArrayList[2] = 15;
//        ArrayList[3] = 17;
//        System.out.println(ArrayList[1, 2]);

//        ArrayList List = new ArrayList<>();
//            list.add("a");
//            list.add("b");
//            list.add("c");
//            list.add("b");
//            list.add("d");
//            list.add("d");
//            list.add("e");
//        System.out.println(list);
//
//        while(list.remove("c" + "d"));
//        System.out.println(list);
//
//    }
//}