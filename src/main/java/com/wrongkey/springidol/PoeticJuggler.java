package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 会朗诵诗歌的杂技师（好高大上的样子）
 *@date 2014/10/28
 *@version v1.0
 *
 */
public class PoeticJuggler extends Juggler{
    private Poem poem;  //要朗诵的诗歌

    public PoeticJuggler(String name,Poem poem){
        super(name);
        this.poem = poem;
    }

    public PoeticJuggler(String name, int beanBags, Poem poem) {
        super(name, beanBags);
        this.poem = poem;
    }

    /**
     *@author wrongkey
     *@description 会朗诵诗歌的杂技师表演抛豆袋子，同时朗诵诗歌
     *@date 2014/10/28
     *@version v1.0
     *
     */
    public void perform() throws PerformanceException{
        super.perform();
        System.out.println("While reciting......");
        poem.recite();
    }

}
