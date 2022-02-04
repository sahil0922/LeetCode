List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        
        List<Integer> list0 = new ArrayList<>();
        list0.add(1);
       
        mainList.add(list0);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> prev = mainList.get(i - 1);
            list.add(1);
        
            for(int j = 0; j < prev.size() - 1; j++){
                int x = prev.get(j);
                int y = prev.get(j + 1);
                list.add(x + y);
            }
            
            list.add(1);
            
            mainList.add(list);
        }
        
        return mainList;
    }
