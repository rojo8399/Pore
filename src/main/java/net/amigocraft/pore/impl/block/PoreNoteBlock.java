/*
 * Pore
 * Copyright (c) 2014-2015, Lapis <https://github.com/LapisBlue>
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.amigocraft.pore.impl.block;

import net.amigocraft.pore.util.converter.PoreConverter;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.block.NoteBlock;
import org.spongepowered.api.block.BlockState;

public class PoreNoteBlock extends PoreBlockState implements NoteBlock {

    public static PoreNoteBlock of(BlockState handle) {
        return PoreConverter.of(PoreNoteBlock.class, handle);
    }

    protected PoreNoteBlock(BlockState handle) {
        super(handle);
    }

    @Override
    public Note getNote() {
        throw new NotImplementedException();
    }

    @Override
    public byte getRawNote() {
        throw new NotImplementedException();
    }

    @Override
    public void setNote(Note note) {
        throw new NotImplementedException();
    }

    @Override
    public void setRawNote(byte note) {
        throw new NotImplementedException();
    }

    @Override
    public boolean play() {
        throw new NotImplementedException();
    }

    @Override
    public boolean play(byte instrument, byte note) {
        throw new NotImplementedException();
    }

    @Override
    public boolean play(Instrument instrument, Note note) {
        throw new NotImplementedException();
    }
}
