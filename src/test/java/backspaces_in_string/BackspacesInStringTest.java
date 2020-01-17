package backspaces_in_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackspacesInStringTest {

    BackspacesInString sut = new BackspacesInString();

    @Test
    public void シャープが1つ含まれる時1つ前の文字を削除した文字列を返す_2文字() {
        assertEquals("a", sut.cleanString("ab#"));
    }

    @Test
    public void シャープが1つ含まれる時1つ前の文字を削除した文字列を返す_1文字() {
        assertEquals("", sut.cleanString("a#"));
    }

    @Test
    public void シャープの前に文字が存在しな時文字を削除せず文字列を返す() {
        assertEquals("a", sut.cleanString("#a"));
    }

    @Test
    public void シャープが取り除かれた形になる_1() {
        assertEquals("ac", sut.cleanString("abc#d##c"));
    }

    @Test
    public void シャープが取り除かれた形になる_2() {
        assertEquals("", sut.cleanString("abc####d##c#"));
    }

}