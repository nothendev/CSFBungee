package ru.magmacube.csfbungee;

import java.util.logging.Filter;

public interface CustomFilter extends Filter
{
    Filter inject();
}
